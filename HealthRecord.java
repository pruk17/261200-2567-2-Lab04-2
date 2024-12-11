public class HealthRecord {
    private
        int height;
        static final int MIN_PERMITTED_HEIGHT = 50;
        static final int MAX_PERMITTED_HEIGHT = 175;
        static final int DEFAULT_HEIGHT = 100;
        static int tallestHeight = MIN_PERMITTED_HEIGHT;
        static int shortestHeight = MAX_PERMITTED_HEIGHT;
        //----------------------------------------------
        static int counter = 0;
        static int averageHeight  = 0;
    public
        HealthRecord(int height) {
        setHeight(height);
    }
        void setHeight(int height) {
        if ( height >= MIN_PERMITTED_HEIGHT && height <= MAX_PERMITTED_HEIGHT )this.height = height;
        else this.height = DEFAULT_HEIGHT;

        if ( this.height >= tallestHeight ) tallestHeight = this.height ;
        if ( this.height <= shortestHeight ) shortestHeight = this.height;
        //y' = (y*(n) + x)/n'

        if(counter == 0){
            averageHeight  = (this.height);
            counter++;
        }
        else {
            averageHeight  = ((averageHeight*counter) + this.height)/ (counter + 1);
            counter++;
        }
    }
        int getHeight() {
        return this.height;
    }
        static int getTallestHeight() {
            return HealthRecord.tallestHeight;
    }
        static int getShortestHeight() {
            return HealthRecord.shortestHeight;
        }
        static int getAverageHeight(){
            return HealthRecord.averageHeight;
        }

    void displayDetails() {
        System.out.println("Height (cm): " + getHeight());
    }
    static void displayClassDetails() {
        System.out.println("The tallest height (cm): " + getTallestHeight());
        System.out.println("The shortest height (cm): " + getShortestHeight());
        System.out.println("The average height (cm): " + getAverageHeight());
    }
}
