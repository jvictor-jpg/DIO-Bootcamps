import React from 'react';
import * as S from './styled';

export default function RepoItem({name, linkToRepo, fullName}) {
  return (
    <S.Wapper>
        <S.WapperTitle>{name}</S.WapperTitle>
        <S.WapperFullName>Full Name:</S.WapperFullName>
        <S.WapperLink href={linkToRepo} target="_blank" rel="noreferrer">
            {fullName}
        </S.WapperLink>
    </S.Wapper>
  )
}
