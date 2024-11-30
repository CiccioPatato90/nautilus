<template>
  <div class="register-container">
    <h1>Register</h1>
    <form @submit.prevent="handleRegister">
      <div>
        <label for="firstName">First Name:</label>
        <input id="firstName" v-model="firstName" type="text" required />
      </div>
      <div>
        <label for="lastName">Last Name:</label>
        <input id="lastName" v-model="lastName" type="text" required />
      </div>
      <div>
        <label for="email">Email:</label>
        <input id="email" v-model="email" type="email" required />
      </div>
      <div>
        <label for="password">Password:</label>
        <input id="password" v-model="password" type="password" required />
      </div>

      <PickerComponent
        :items="reparti"
        label="Choose your reparto:"
        picker-id="reparto-picker"
        v-model:selectedOption="rep"
      />

      <button type="submit">Register</button>
      <router-link to="/">Back To Login</router-link>
    </form>
    <p v-if="error" class="error">{{ error }}</p>
  </div>
</template>

<script>
import PickerComponent from '@/components/partials/PickerComponent.vue';
import registrationService, {fetchReparti} from '@/services/authService.js';

export default {
  components: {
    PickerComponent,
  },
  data() {
    return {
      firstName: '',
      lastName: '',
      email: '',
      password: '',
      rep: '', // Selected role from the picker
      reparti: [], // List of roles fetched from the backend
      error: null,
    };
  },
  async mounted() {
    fetchReparti()
      .then((reparti) => {
        this.reparti = reparti;
      })
      .catch((error) => {
        console.error('Failed to fetch roles:', error);
      });
  },
  methods: {
    async handleRegister() {
      console.log('User data:', {
        firstName: this.firstName,
        lastName: this.lastName,
        email: this.email,
        password: this.password,
        rep: this.rep,
      });
      // Add your registration logic here
    },
  },
};
</script>

<style scoped>
.register-container {
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
