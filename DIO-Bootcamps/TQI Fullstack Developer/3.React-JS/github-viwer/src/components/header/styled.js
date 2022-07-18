import styled from 'styled-components';

export const Wrapper = styled.div`
  display: flex;
  width: 100%;
  justify-content: space-between;
  padding: 4px;

  input{
    border: 1px solid #ccc;
    border-radius: 5px;
    width: 100%;
    height: 44px;
    padding: 8px;
    font-weight: 500;
  }

  button{
    background-color: #225ed8;
    padding: 8px 16px;
    margin: 0 16px;
    border-radius: 8px;
    font-weight: bold;
    color: white;

    &:hover{
        background-color: #2c5282;
        box-shadow: 2px 2px 10px rgba(0, 0, 0, 0.2);
    }
  }
`;
