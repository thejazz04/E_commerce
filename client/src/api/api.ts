import { getToken } from '@/config/AuthConfig';
import axios from 'axios';

const API = "http://localhost:8080"

const axiosInstance = axios.create({
    baseURL: API,
})

axiosInstance.interceptors.request.use(
    (config) => {
        const token = getToken()
        if (token) {
            config.headers.Authorization = `${token}`
        }
        return config;
    },
    (error) => {
        return Promise.reject(error)
    }
)


const AppLogin = () => axios.post(`${API}/login`)
const AppRegister = (user: any) => axios.post(`${API}/register`, user)

const allProducts = () => axios.get(`${API}/products/all`)
const addProduct = (product: any) => axios.post(`${API}/products/add`, product)
const editProduct = (product: any, id: string) => axios.put(`${API}/products/edit/${id}`, product)
const deleteProduct = (id: string) => axios.delete(`${API}/products/delete/${id}`)

const allUsers = () => axios.get(`${API}/user/getAll`)
const addUser = (user: any) => axios.post(`${API}/user/addUser`, user)
const editUser = (user: any, id: string) => axios.put(`${API}/user/editUser/${id}`, user)
const deleteUser = (id: string) => axios.delete(`${API}/user/delete/${id}`)
const getUserByID = (id: string) => axios.get(`${API}/user/get/${id}`)

const allOrders = () => axios.get(`${API}/orders/allDetails`)
const addOrder = (user: any) => axios.post(`${API}/orders/save`, user)

export {
    AppLogin,
    AppRegister,
    allProducts,
    addProduct,
    editProduct,
    deleteProduct,
    allUsers,
    addUser,
    editUser,
    deleteUser,
    allOrders,
    addOrder,
    getUserByID
}