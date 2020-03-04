import React, { Component } from 'react';
import '../App.css';
import StudentDataService from '../service/StudentDataService';

class ListStudents extends Component {
  constructor(props) {
    super(props);
    this.state = {
      students: [],
      message: null
    };
    this.refreshStudents = this.refreshStudents.bind(this);
  }

  componentDidMount() {
    this.refreshStudents();
  }

  refreshStudents() {
    StudentDataService.retrieveAllStudents().then(response => {
      console.log(response);
      this.setState({ students: response.data });
    });
  }

  render() {
    return (
      <div className="container">
        <h3>All Students</h3>
        <div className="container">
          <table className="table">
            <thead>
              <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Email</th>
              </tr>
            </thead>
            <tbody>
              {this.state.students.map(student => (
                <tr key={student.id}>
                  <td>{student.id}</td>
                  <td>{student.name}</td>
                  <td>{student.email}</td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>
      </div>
    );
  }
}

export default ListStudents;
