package com.algorithms.greedy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TaskScheduling {

    private static final Scanner scanner = new Scanner(System.in);

    static List<Integer> taskScheduling(List<Job> jobList) {
        /*
         * Write your code here.
         */
        List<Integer> jobOverShoot = new LinkedList<>();

        for(Job job : jobList)
        {
            jobOverShoot.add(job.getDeadline());
        }
        return jobOverShoot;

    }

    public static void main(String[] args) throws IOException {

        int t = Integer.parseInt(scanner.nextLine().trim());

        List<Job> jobList = new LinkedList<>();

        for (int tItr = 0; tItr < t; tItr++) {
            String[] dm = scanner.nextLine().split(" ");

            int d = Integer.parseInt(dm[0].trim());

            int m = Integer.parseInt(dm[1].trim());

            Job job = new Job(d, m);
            jobList.add(job);


        }

        List<Integer> jobOverShoot = taskScheduling(jobList);
        System.out.println(jobOverShoot);
    }

    static class Job {
        public int deadline;
        public int minuteToAcomplish;

        public Job(int deadline, int minuteToAcomplish) {
            this.deadline = deadline;
            this.minuteToAcomplish = minuteToAcomplish;
        }

        public int getDeadline() {
            return deadline;
        }

        public int getMinuteToAcomplish() {
            return minuteToAcomplish;
        }
    }


}

