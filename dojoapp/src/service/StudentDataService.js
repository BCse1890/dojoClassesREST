import axios from 'axios';

class StudentDataService {
  retrieveAllStudents() {
    return axios.get(`http://localhost:8080/studentWeb/students`);
  }
}

export default new StudentDataService();
