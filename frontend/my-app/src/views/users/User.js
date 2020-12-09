import React, { Component } from "react";
import axios from "axios";


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
  const { params } = this.props.match;
  console.log(params.key1);
    axios.get("http://localhost:8080/api/user?id="+params.id)
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
        <h2>상세보기</h2>
        {ItemList.no}<br></br>
        {ItemList.name}<br></br>
        {ItemList.id}<br></br>
        {ItemList.password}<br></br>
        {ItemList.hp}<br></br>
        {ItemList.address}<br></br>
        {ItemList.email}<br></br>
        {ItemList.brith}<br></br>
        {ItemList.sex}<br></br>
        {ItemList.rank}<br></br>
        {ItemList.salary}<br></br>
        {ItemList.department}<br></br>
        {ItemList.branch}<br></br>
        {ItemList.profile_name}<br></br>
        {ItemList.profile_size}<br></br>
        {ItemList.verify}<br></br>
        {ItemList.regidate}<br></br>
      </div>
    );
  }
}

export default Users;
