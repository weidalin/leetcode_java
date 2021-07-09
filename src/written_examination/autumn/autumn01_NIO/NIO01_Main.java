package written_examination.autumn.autumn01_NIO;

public class NIO01_Main {
    /**
     * 计算一个点与一个三角形最近的距离
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param point float浮点型一维数组 The point in the format of [x,y]
     * @param triangle float浮点型二维数组 The triangle in the format of [[x1, y1], [x2, y2], [x3, y3]​].
     * @return float浮点型
     */
    public float calculateDistance (float[] point, float[][] triangle) {
        // write code here
//        return 0.0f;
        float min_distance = Float.MAX_VALUE;

        for(int i = 0; i < triangle.length; i++){
            min_distance = Math.min(min_distance, get_distance(point, triangle[i], triangle[i % 3]));
        }
        return min_distance;
        /*
        def get_distance(point, p1, p2):
            A = p2[1] - p1[1]
            B = p1[0] - p2[0]
            C = (p1[1] - p2[1]) * p1[0] + (p2[0] - p1[0]) * p1[1])
            #根据点到直线的距离公式计算距离
            distance = abs(A * point[0] + B * point[1] + C) / (math.sqrt(A**2 + B**2)+1e-6)
            return distance
         */
    }
    public float get_distance(float[] point, float[] p1, float[] p2){
        float A = p2[1] - p1[1];
        float B = p1[0] - p2[0];
        float C = (p1[1] - p2[1]) * p1[0] + (p2[0] - p1[0] * p1[1]);
        double distance = Math.abs(A * point[0] + B * point[1] + C) / Math.sqrt(Math.pow(A,2) + Math.pow(B, 2));
        return (float) distance;
    }
}
