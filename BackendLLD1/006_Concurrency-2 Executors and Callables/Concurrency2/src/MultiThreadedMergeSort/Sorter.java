package MultiThreadedMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    List<Integer> arrayToSort;
    ExecutorService executor;

    Sorter(List<Integer> arrayToSort,ExecutorService executor){
        this.arrayToSort = arrayToSort;
        this.executor = executor;
    }

    public List<Integer> call() throws Exception {
        if(arrayToSort.size() == 1) {
            return arrayToSort;
        }

        int mid = arrayToSort.size() / 2;

        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();

        for(int i=0; i<mid; i++) {
            leftArray.add(arrayToSort.get(i));
        }

        for(int i=mid; i<arrayToSort.size(); i++) {
            rightArray.add(arrayToSort.get(i));
        }

        Sorter leftArrSorter = new Sorter(leftArray, executor);
        Sorter rightArrSorter = new Sorter(rightArray, executor);

//        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<List<Integer>> leftFuture = executor.submit(leftArrSorter);
        Future<List<Integer>> rightFuture = executor.submit(rightArrSorter);

        List<Integer> sortedLeftArr = leftFuture.get();
        List<Integer> sortedRightArr = rightFuture.get();

        return merge(leftFuture.get(), rightFuture.get());
    }

    private List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> merged = new ArrayList<>();
        int i = 0, j = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) merged.add(left.get(i++));
            else merged.add(right.get(j++));
        }
        merged.addAll(left.subList(i, left.size()));
        merged.addAll(right.subList(j, right.size()));
        return merged;
    }
}
