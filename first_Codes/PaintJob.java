import java.util.zip.GZIPOutputStream;

public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(3.75,2.25,2.5,1));
        System.out.println(getBucketCount(3.4,2.1,1.5));
        System.out.println(getBucketCount(3.4,1.5));

    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width<=0 || height<=0 || areaPerBucket<=0 || extraBuckets<0){
            return -1;
        }
        double areaRestante=width*height - extraBuckets*areaPerBucket;
        int countBuckets=0,i=1;
        while (true){
            if(areaRestante - areaPerBucket*i >= 0){
                areaRestante-= areaPerBucket*i;
                countBuckets++;
            }else{
                break;
            }

        }
        return countBuckets+1;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width<=0 || height<=0 || areaPerBucket<=0){
            return -1;
        }
        double areaRestante=width*height;
        int countBuckets=0,i=1;
        while (true){
            if(areaRestante - areaPerBucket*i >= 0){
                areaRestante-= areaPerBucket*i;
                countBuckets++;
            }else{
                break;
            }

        }
        return countBuckets+1;
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if(area<=0 || areaPerBucket<=0){
            return -1;
        }
        double areaRestante=area;
        int countBuckets=0,i=1;
        while (true){
            if(areaRestante - areaPerBucket*i >= 0){
                areaRestante-= areaPerBucket*i;
                countBuckets++;
            }else{
                break;
            }
        }
        return countBuckets+1;
    }

}
