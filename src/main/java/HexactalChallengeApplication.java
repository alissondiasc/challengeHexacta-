public class HexactalChallengeApplication {
    public static void main(String[] args) {
        int[] S1A = {1, 3, 6, 4, 1, 2};
        int[] S1B = {1, 2, 3};
        int[] S1C = {-1, -3};
        Solution1 solution1 = new Solution1();

        System.out.println("Solução 1 ");
        System.out.println(solution1.solution(S1A));
        System.out.println(solution1.solution(S1B));
        System.out.println(solution1.solution(S1C));


        int [] S2A = {-2, -1, 0, 2, 4, 7, 8, 9, 9};
        Solution2 solution2 = new Solution2();
        System.out.println("Solução 2 ");
        System.out.println(solution2.solution(S2A, 8));
        int m = 1000;
        double p = 0.999999999999D;
        Solution3 solution3 = new Solution3();
        System.out.println("Solução 3 ");
        System.out.println(solution3.calcPM(m,p));


        Solution4 solution4 = new Solution4();
        System.out.println("Solução 4 ");
        solution4.printIntersection(S1A, S1B);

    }
}
