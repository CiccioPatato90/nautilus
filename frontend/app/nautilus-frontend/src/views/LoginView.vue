<template>
  <div class="login-container">
    <h1>Login</h1>
    <form @submit.prevent="handleLogin">
      <div>
        <label for="username">Username:</label>
        <input id="username" v-model="username" type="text" required />
      </div>
      <div>
        <label for="password">Password:</label>
        <input id="password" v-model="password" type="password" required />
      </div>
      <button type="submit">Login</button>

      <router-link to="/register">Register</router-link>
    </form>
    <p v-if="error" class="error">{{ error }}</p>
  </div>
</template>

<script>

import {login} from "@/services/authService.js";
import {Utente} from "@/generated/src/index.js";

export default {
  data() {
    return {
      username: '',
      password: '',
      error: null,
    };
  },
  methods: {
    async handleLogin() {
      this.error = null; // Clear any previous error
      /*try {
        const result = await authService.login(this.username, this.password);
        console.log('Login successful:', result);
        // Navigate to another page after successful login
        // this.$router.push('/home');
      } catch (error) {
        this.error = 'Login failed. Please check your credentials.';
      }*/


      const utente = new Utente(this.username, 'Doe', 'john.doe@example.com', this.password);

      console.log('sending:', utente);

      login({utente,
        })
        .then((response) => {
          console.log('Login successful:', response);
        })
        .catch((error) => {
          console.error('Login failed:', error);
        });
    },
  },
};
</script>

<style scoped>
.login-container {
  max-width: 400px;
  margin: 0 auto;
  padding: 1em;
  text-align: center;
}

.error {
  color: red;
  margin-top: 1em;
}
</style>
