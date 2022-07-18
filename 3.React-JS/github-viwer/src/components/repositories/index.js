import React, {useState, useEffect} from 'react';
import useGithub from '../../hooks/github-hooks';
import RepoItem from '../repo-item';
import * as S from  './styled';

function Repositories() {
  const { githubState, getUserRepos, getUserStarred } = useGithub();
  const [hasUserForRepos, setHasUserForRepos] = useState(false)
  
  useEffect(() => {
    if(githubState.user.login){
      getUserRepos(githubState.user.login);
      getUserStarred(githubState.user.login);
    }

    setHasUserForRepos(githubState.repositories)
  }, [getUserRepos, getUserStarred, githubState.repositories, githubState.user.login])
  

  return (
    <>
      {hasUserForRepos ? (
      <S.WrapperTabs 
      selectedTabClassName="is-selected"
      selectedTabPanelClassName="is-selected">
          <S.WrapperTabList>
              <S.WrapperTab>Repositories</S.WrapperTab>
              <S.WrapperTab>Stars</S.WrapperTab>
          </S.WrapperTabList>
          <S.WrapperTabPanel>
            <S.WrapperList>
              {githubState.repositories.map(item => (
                <RepoItem
                key={item.id}
                name={item.name}
                linkToRepo={item.full_name}
                fullName={item.full_name}
                />
              ))}
            </S.WrapperList>
          </S.WrapperTabPanel>
          <S.WrapperTabPanel>
            <S.WrapperList>
                {githubState.starred.map(item => (
                  <RepoItem
                  key={item.id}
                  name={item.name}
                  linkToRepo={item.full_name}
                  fullName={item.full_name}
                  />
                ))}
            </S.WrapperList>
          </S.WrapperTabPanel>
      </S.WrapperTabs>
      ) : <></>
      }
    </>
  )
}

export default Repositories