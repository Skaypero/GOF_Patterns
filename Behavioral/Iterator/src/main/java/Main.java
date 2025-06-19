public class Main {
    public static void main(String[] args) {
        Track track1 = new Track("n1", "a1", "d1");
        Track track2 = new Track("n2", "a2", "d2");
        Track track3 = new Track("n3", "a3", "d3");

        TrackCollection trackCollection = new TrackCollection();
        trackCollection.add(track1);
        trackCollection.add(track2);
        trackCollection.add(track3);

        Iterator iterator = trackCollection.createIterator();

        System.out.println(iterator.current());

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
