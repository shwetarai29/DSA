package practice.Arrays;

import java.util.ArrayList;
import java.util.Comparator;

public class MergeOverLappingInterval {

    static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        ArrayList<Interval> result = new ArrayList<>();
        intervals.sort(new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });
        result.add(intervals.get(0));
        for (int i = 1; i < intervals.size(); i++) {
            int af = intervals.get(i).start;
            int al = intervals.get(i).end;
            int sl = result.get(result.size() - 1).end;
            if (sl >= af)
                result.get(result.size() - 1).end = Math.max(al, sl);
            else
                result.add(new Interval(af, al));
        }
        return new ArrayList<>(result);
    }

    public static void main(String args[]) {
        ArrayList<Interval> arr = new ArrayList<>();
        arr.add(new Interval(6, 8));
        arr.add(new Interval(2, 9));
        arr.add(new Interval(2, 4));
        arr.add(new Interval(4, 7));
        arr.add(new Interval(1, 1));
        System.out.println(merge(arr).toString());
    }

    static class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }

        @Override
        public String toString() {
            return start +
                    "," + end;
        }
    }
}


