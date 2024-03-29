package controllers;

import models.Book;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Result;
import play.mvc.Controller;
import views.html.books.create;
import views.html.books.index;

import javax.inject.Inject;
import java.util.Set;

public class BooksController extends Controller {

    @Inject
    FormFactory formFactory;

    public Result index() {
        Set<Book> books = Book.allBooks();

        return ok(index.render(books));
    }

    public Result create() {
        Form<Book> bookForm = formFactory.form(Book.class);

        return ok(create.render(bookForm));
    }

    public Result save() {
        return TODO();
    }

    public Result edit(Integer id) {
        return TODO();
    }

    public Result update() {
        return TODO();
    }

    public Result destroy(Integer id) {
        return TODO();
    }

    public Result show(Integer id) {
        return TODO();
    }

}
