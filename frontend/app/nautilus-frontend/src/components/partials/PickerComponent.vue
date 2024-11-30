<template>
  <div>
    <label :for="pickerId">{{ label }}</label>
    <select :id="pickerId" v-model="selected" @change="emitSelection">
      <option disabled value="">-- Select an option --</option>
      <option v-for="item in items" :key="item" :value="item">
        {{ item }}
      </option>
    </select>
  </div>
</template>

<script>
export default {
  props: {
    items: {
      type: Array,
      required: true, // Pass the list of items from parent
    },
    label: {
      type: String,
      default: 'Choose an option:',
    },
    pickerId: {
      type: String,
      default: 'picker',
    },
  },
  data() {
    return {
      selected: '', // The selected option
    };
  },
  methods: {
    emitSelection() {
      // Emit the selected option to the parent component
      this.$emit('update:selectedOption', this.selected);
    },
  },
};
</script>

<style scoped>
select {
  margin-top: 10px;
  padding: 5px;
}
</style>
