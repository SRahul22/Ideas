public class Histogram {
    public void print(int[] data, int[] frequency) {
        ArrayTools arrayTools = new ArrayTools();
        int maxheight = arrayTools.max(frequency);
        int maxwidth = arrayTools.max(data);
        char[][] arr = arrayTools.initializeBlank2DCharArray(maxwidth, maxheight);
//        arrayTools.print2D(arr);
        for (int j = 0; j < data.length; j++) {
            int height = frequency[j];
            int valuesToBefilled = maxheight - height;
            for (int i = valuesToBefilled; i < maxheight; i++) {
                arr[i][j] = '-';
            }
        }
        arrayTools.print2D(arr);

    }

}
