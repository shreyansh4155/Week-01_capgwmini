import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class OTPGenerator {

    public static int generateOTP() {
        int otp = (int) (Math.random() * 900000) + 100000; // Generate 6-digit OTP
        return otp;
    }

    public static boolean areOTPsUnique(int[] otps) {
        Set<Integer> uniqueOTPs = new HashSet<>();
        for (int otp : otps) {
            uniqueOTPs.add(otp);
        }
        return uniqueOTPs.size() == otps.length;
    }

    public static void main(String[] args) {
        int[] generatedOTPs = new int[10];

        for (int i = 0; i < 10; i++) {
            generatedOTPs[i] = generateOTP();
        }

        if (areOTPsUnique(generatedOTPs)) {
            System.out.println("All generated OTPs are unique.");
            for (int otp : generatedOTPs) {
                System.out.println(otp);
            }
        } else {
            System.out.println("Generated OTPs are not unique.");
        }
    }
}