import Vue from 'vue';
import VueRouter from 'vue-router';
import Home from '../views/Home.vue';
import MyBooks from '../views/MyBooks.vue';
import NewBook from '../views/NewBook';
import Book from '../views/Book';

Vue.use(VueRouter);

const routes = [
  {
    path: '/',
    name: 'home',
    component: Home
 },
 {
  path: '/myBooks',
  name: 'myBooks',
  component: MyBooks
},
{
  path: '/addBook',
  name: 'newBook',
  component: NewBook
},
{
  path: '/book/:isbn',
  name: 'book',
  component: Book
}
];

const router = new VueRouter({
  mode: 'history',
  routes
});

export default router;
