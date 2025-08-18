import java.util.*;

public class MagicalStars {
   
    static class Line {
        int x1, y1, x2, y2;

        Line(int x1, int y1, int x2, int y2) {
           
            if (x1 < x2 || (x1 == x2 && y1 <= y2)) {
                this.x1 = x1;
                this.y1 = y1;
                this.x2 = x2;
                this.y2 = y2;
            } else {
                this.x1 = x2;
                this.y1 = y2;
                this.x2 = x1;
                this.y2 = y1;
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Line)) return false;
            Line line = (Line) o;
            return x1 == line.x1 && y1 == line.y1 &&
                   x2 == line.x2 && y2 == line.y2;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x1, y1, x2, y2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int N = scanner.nextInt();
        List<Line> lines = new ArrayList<>();

        
        for (int i = 0; i < N; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            lines.add(new Line(x1, y1, x2, y2));
        }

       
        int K = scanner.nextInt();

        
        Map<String, List<Integer>> intersections = new HashMap<>();

       
        for (int i = 0; i < N; i++) {
            Line line1 = lines.get(i);
            for (int j = i + 1; j < N; j++) {
                Line line2 = lines.get(j);
                int[] intersection = findIntersection(line1, line2);
                if (intersection != null) {
                    String key = intersection[0] + "," + intersection[1];
                    intersections.putIfAbsent(key, new ArrayList<>());
                    intersections.get(key).add(i);
                    intersections.get(key).add(j);
                }
            }
        }

        int totalIntensity = 0;

        for (Map.Entry<String, List<Integer>> entry : intersections.entrySet()) {
            List<Integer> lineIndices = entry.getValue();
            Set<Integer> uniqueLines = new HashSet<>(lineIndices);

            if (uniqueLines.size() == K) {
                String[] coords = entry.getKey().split(",");
                int x = Integer.parseInt(coords[0]);
                int y = Integer.parseInt(coords[1]);

              
                int intensity = calculateIntensity(x, y, uniqueLines, lines);
                totalIntensity += intensity;
            }
        }

        System.out.println(totalIntensity);
    }

   
    private static int[] findIntersection(Line line1, Line line2) {
        int x1 = line1.x1, y1 = line1.y1, x2 = line1.x2, y2 = line1.y2;
        int x3 = line2.x1, y3 = line2.y1, x4 = line2.x2, y4 = line2.y2;

        int A1 = y2 - y1;
        int B1 = x1 - x2;
        int C1 = A1 * x1 + B1 * y1;

        int A2 = y4 - y3;
        int B2 = x3 - x4;
        int C2 = A2 * x3 + B2 * y3;
        int det = A1 * B2 - A2 * B1;
        if (det == 0) {
            return null;
        } else {
            double px = (double)(B2 * C1 - B1 * C2) / det;
            double py = (double)(A1 * C2 - A2 * C1) / det;

           
            if (px != (int) px || py != (int) py) {
                return null; 
            }

            int ix = (int) px;
            int iy = (int) py;

          
            if (isOnLineSegment(x1, y1, x2, y2, ix, iy) && isOnLineSegment(x3, y3, x4, y4, ix, iy)) {
                return new int[]{ix, iy};
            }
            return null;
        }
    }

   
    private static boolean isOnLineSegment(int x1, int y1, int x2, int y2, int px, int py) {
        return Math.min(x1, x2) <= px && px <= Math.max(x1, x2) &&
               Math.min(y1, y2) <= py && py <= Math.max(y1, y2);
    }

  
    private static int calculateIntensity(int x, int y, Set<Integer> lineIndices, List<Line> lines) {
        List<Integer> cellCounts = new ArrayList<>();

        for (int idx : lineIndices) {
            Line line = lines.get(idx);
            int x1 = line.x1, y1 = line.y1, x2 = line.x2, y2 = line.y2;

            if ((x == x1 && y == y1)) {
               
                int cells = countCells(x, y, x2, y2);
                cellCounts.add(cells);
            } else if ((x == x2 && y == y2)) {
                
                int cells = countCells(x, y, x1, y1);
                cellCounts.add(cells);
            } else {
               
                int cells1 = countCells(x, y, x1, y1);
                int cells2 = countCells(x, y, x2, y2);
                cellCounts.add(cells1);
                cellCounts.add(cells2);
            }
        }

        if (cellCounts.isEmpty()) {
            return 0;
        }

  
        int min = Integer.MAX_VALUE;
        for (int c : cellCounts) {
            min = Math.min(min, c);
        }
        return min;
    }


    private static int countCells(int starX, int starY, int endX, int endY) {
        if (endX == starX) {

            return Math.abs(endY - starY);
        } else if (endY == starY) {
           
            return Math.abs(endX - starX);
        } else {
            
            return Math.abs(endX - starX); 
        }
    }
}

