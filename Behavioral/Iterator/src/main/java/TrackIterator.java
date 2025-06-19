public class TrackIterator implements Iterator {
    private TrackCollection tracks;
    private int index;

    public TrackIterator(TrackCollection tracks) {
        this.tracks = tracks;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return tracks.count() > index + 1;
    }

    @Override
    public Track next() {
        return tracks.get(++index);
    }

    @Override
    public Track current() {
        return tracks.get(index);
    }
}
