import React, {useState} from 'react';
import * as S from './styled';
import useGithub from '../../hooks/github-hooks'

export default function Header() {
  const {getUser} = useGithub();
  const [usernameForSearch, setUsernameForSearch] = useState();

  function submitGetUser(){
    if(!usernameForSearch) return;
    return getUser(usernameForSearch);
  }

  return (
    <header>
        <S.Wrapper>
            <input type="text" 
            placeholder='GitHub Username...' 
            onChange={(e) => setUsernameForSearch(e.target.value)}/>

            <button type='submit' onClick={submitGetUser}>Search</button>
        </S.Wrapper>
    </header>
  )
}
