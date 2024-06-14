import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './pages/Login/App'
import './index.css'
import {createBrowserRouter, RouterProvider} from "react-router-dom";
import { EnemyShop } from './pages/EnemyShop';

const router = createBrowserRouter([
  {
    path: "/",
    element: <App/>
  },
  {
    path: '/enemyShop',
    element: <EnemyShop/>
  }
]);

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <RouterProvider router={router} />
  </React.StrictMode>,
)
