package biblioteka;

public class book {
    private String title;
    private int pages;
    private String author;
    private boolean available;

    public void setTitle(String title) {
        if (title != null && !title.isEmpty() && title.length() <= 25) {
            this.title = title;
        } else {
            System.out.println("ошибка в названии");
        }
    }
    public String getTitle() {
        return this.title;
    }
    public void setPages(int pages) {
        if (pages > 50) {
            this.pages = pages;
        } else {
            System.out.println("слишком мало страниц");
        }
    }
    public int getPages(){
        return this.pages;
    }
    public void setAuthor(String author) {
        if (author != null && !author.isEmpty()) {
            this.author = author;
        } else {
            System.out.println("неправильно введена фамилия автора");
        }
    }
    public String getAuthor(){
        return this.author;
    }
    public void setAvailable(boolean available){
        this.available = available;
    }
    public boolean isAvailable(){
        return this.available;
        }
        public void printInfo(){
            System.out.println("\n---информация о книге---");
            System.out.println("название книги: " + getTitle());
            System.out.println("количество страниц: " + getPages());
            System.out.println("фамилия автора: " + getAuthor());
            if (available == true){
                System.out.println("книга в наличии");
            } else {
                System.out.println("книга отсутствует");
            }
        }
        public void borrow() {
            if (available) {
                available = false;
                System.out.println("вы успешно забрали книгу");
            } else {
                System.out.println("книга уже выдана");
            }
        }
        public void giveBack(){
            System.out.println("вы успешно вернули книгу");
            available = true;
            }
        }


