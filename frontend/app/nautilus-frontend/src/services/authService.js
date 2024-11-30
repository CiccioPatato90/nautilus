// src/services/authService.js
import axios from 'axios';
import {AuthControllerApi, RepartiControllerApi, Utente} from "@/generated/src/index.js";

//const API_URL = 'http://localhost:8080';
// Create an instance of the RoleApi with the default Axios instance

const repartiApi = new RepartiControllerApi();
const authApi = new AuthControllerApi();

/**
 * Login using the provided options.
 * @param {Object} opts Optional parameters
 * @param {Object.<String, {String: String}>} opts.requestBody The request body for the login request
 * @return {Promise<String>} A Promise that resolves to a String
 */
export const login = (opts) => {
  console.log("OPT_AUTHSERV: ", opts)
  console.log("OPT_AUTHSERV: ", opts['utente'])
  return authApi.loginPost(opts); // Adjust to match the generated method
};


/*const login = async (username, password) => {
  return new Promise((resolve, reject) => {
    authApi.loginPost((error, data, response) => {
      if (error) {
        console.error('Error fetching roles:', error);
        reject(error);
      } else {
        console.log('Received:', data);
        resolve(data);
      }
    });
  });

  try {
    const response = await axios.post(`${API_URL}/login`, {
      username,
      password,
    });
    return response.data;
  } catch (error) {
    console.error('Error during login:', error);
    throw error;
  }
};*/


export const fetchReparti = async () => {
  return new Promise((resolve, reject) => {
    repartiApi.repartiListGet((error, data, response) => {
      if (error) {
        console.error('Error fetching roles:', error);
        reject(error);
      } else {
        console.log('Received:', data);
        resolve(data);
      }
    });
  });
};

export default {
  login,
  fetchReparti
};
