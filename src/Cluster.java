import java.util.ArrayList;
import java.util.List;

/**
 * Created by larsh on 13-7-2016.
 */
public class Cluster {

    public List<Point> points;
    public Point centroid;
    public int id;

    //Creates a new Cluster
    public Cluster(int id) {
        this.id = id;
        this.points = new ArrayList();
        this.centroid = null;
    }

    public List getPoints() {
        return points;
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    public void setPoints(List points) {
        this.points = points;
    }

    public Point getCentroid() {
        return centroid;
    }

    public void setCentroid(Point centroid) {
        this.centroid = centroid;
    }

    public int getId() {
        return id;
    }

    public void clear() {
        points.clear();
    }

    public void plotCluster() {
        System.out.println("[Cluster: " + id + "]");
        System.out.println("\t[Centroid: " + centroid + "]");
        System.out.print("\t[Points:");
//        for(Point p : points) {
//            System.out.println(p);
//        }
        System.out.print("\t" + getPoints().size());
        System.out.println("]");
    }

}