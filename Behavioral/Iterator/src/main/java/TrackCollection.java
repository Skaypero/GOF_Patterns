import java.util.ArrayList;
import java.util.List;

public class TrackCollection {
    private List<Track> tracks;

    public TrackCollection() {
        tracks = new ArrayList<>();
    }

    public void add(Track track) {
        tracks.add(track);
    }

    public int count() {
        return tracks.size();
    }

    public Track get(int index) {
        return tracks.get(index);
    }

    public Iterator createIterator() {
        return new TrackIterator(this);
    }
}
