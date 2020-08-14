<template>
  <div>
    <book-details v-bind:book="book"/>
  </div>
</template>

<script>
import BookDetails from '@/components/BookDetails.vue';
export default {
    components: {
        BookDetails
    },
    computed: {
      book() {
        let bookToView = {};
        const books = this.$store.state.books;
        const popularBooks = this.$store.state.popularBooks;

        books.forEach(book => {
          if (book.isbn === this.$route.params.isbn) {
            bookToView = book;
          }
        });
        popularBooks.forEach(book => {
          if (book.isbn === this.$route.params.isbn) {
            bookToView = book;
          }
        });
        return bookToView;
      }
    }
}
</script>