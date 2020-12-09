import React, { Component } from "react";
import axios from "axios";
import { BrowserRouter as Link } from 'react-router-dom';
import './table.css';

class Users extends Component {
  constructor(props) {
    super(props)
    this.state = {
        ItemList: ""
    }
}

componentDidMount() {
    this.getApi();
}

getApi = () => {
    axios.get("http://localhost:8080/api/users")
        .then(res => {
            console.log(res);
            this.setState({
              ItemList: res.data.message
            })
        })
        .catch(res => console.log(res))
}

  render() {
    const { ItemList } = this.state;
    console.log(ItemList);
    return (
      <div>
        <table>
        <thead>
          <tr><td>NO</td><td>NAME</td><td>ID</td><td>password</td><td>HP</td><td>ADDRESS</td>
          <td>E-MAIL</td><td>BIRTH</td><td>SEX</td><td>RANK</td><td>SAL</td><td>DEPART</td><td>branch</td>
          <td>PROFILE</td><td>VERIFY</td><td>DATE</td></tr>
        </thead>
        <tbody>
         {ItemList&&ItemList.map((itemdata, insertIndex) => {
            return (
            <tr key={insertIndex}>
                <td>{itemdata.no}</td>
                <td>
              
                  <Link to={`/users/${itemdata.no}?id=${itemdata.no}`}>{itemdata.name}</Link> 
               
                </td>
                <td>{itemdata.id}</td>
                <td>{itemdata.password}</td>
                <td>{itemdata.hp}</td>
                <td>{itemdata.address}</td>
                <td>{itemdata.email}</td>
                <td>{itemdata.birth}</td>
                <td>{itemdata.sex}</td>
                <td>{itemdata.rank}</td>
                <td>{itemdata.salary}</td>
                <td>{itemdata.department}</td>
                <td>{itemdata.branch}</td>
                <td>{itemdata.profile_name}</td>
                <td>{itemdata.verify}</td>
                <td>{itemdata.regidate}</td>
              </tr>
            );
          })}
        </tbody> 
      </table>
      </div>
    );
  }
}

export default Users;
