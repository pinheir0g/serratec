import axios from 'axios'

const api = axios.create({
    baseURL: "https://6674a09c75872d0e0a97133f.mockapi.io/"
})

export default api;