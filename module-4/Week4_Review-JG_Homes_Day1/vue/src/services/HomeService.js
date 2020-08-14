import axios from 'axios';

export default {


  search() {
    return axios.get('/homes')
  }

}