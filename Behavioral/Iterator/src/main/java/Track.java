public class Track {
    private String name;
    private String author;
    private String duration;

    public Track(String name, String author, String duration) {
        this.name = name;
        this.author = author;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Track{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
