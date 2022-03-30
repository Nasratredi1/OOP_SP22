public class dates {
    public static void main(String[] args) {

        dates date= new dates();
        date.setY1(2010);
        date.setY2(2009);
        date.setM1(10);
        date.setM2(12);
        date.setD1(15);
        date.setD2(19);
        date.comparison();

    }
    

    private int y1, y2, m1, m2, d1, d2;

    public void setD1(int d1) {
        this.d1 = d1;
    }

    public void setD2(int d2) {
        this.d2 = d2;
    }



    public void setM1(int m1) {
        this.m1 = m1;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }


    public void comparison() {
        if (y1 > y2) {
            System.out.println(d2 + "/" + m2+ "/" + y2 + " is the smaller date");
        }
        if (y1 < y2) {
            System.out.println(d1 + "/" + m1 + "/" + y1 + " is the smaller date");
        }
        if (y1 == y2) {
            if (m1 > m2) {
                System.out.println(d2 + "/" + m2 + "/" + y2 + " is the smaller date");
            }
            if (m1 < m2) {
                System.out.println(d1 + "/" + m1 + "/" + y1 + " is the smaller date");
            }
            if (m1 == m2) {
                if (d1 > d2) {
                    System.out.println(d2 + "/" + m2 + "/" + y2 + "is the smaller date");
                }
                if (d1 < d2) {
                    System.out.println(d1 + "/" + m1 + "/" + y1 + "is the smaller date");
                }
                if (d1 == d2) {
                    System.out.println("both are the exact same dates");
                }
            }


        }


    }
}