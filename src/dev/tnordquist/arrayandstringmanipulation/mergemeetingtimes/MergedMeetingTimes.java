//package dev.tnordquist.arrayandstringmanipulation.mergemeetingtimes;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class MergedMeetingTimes {
//
//  public static void main(String[] args) {
//
//    ArrayList<Meeting> meetingList = new ArrayList<>();
//    meetingList.add(new Meeting(1, 10));
//    meetingList.add(new Meeting(2, 6));
//    meetingList.add(new Meeting(3, 5));
//    meetingList.add(new Meeting(7, 9));
////    meetingList.add(new Meeting(2, 3));
//
//    MergedMeetingTimes mergedMeetingTimes = new MergedMeetingTimes();
//    List<Meeting> mergedList;
//    mergedList = mergedMeetingTimes.mergeRanges(meetingList);
//    for (Meeting mtg : mergedList) {
//      System.out.print("(" + mtg.getStartTime() + "," + mtg.getEndTime() + ")" + " ");
//    }
//
//
//  }
//
//  List<Meeting> mergeRanges(List<Meeting> mtgList) {
//    List<Meeting> currentMtgList = new ArrayList<>();
//    for (Meeting mtg : mtgList) {
//      currentMtgList.add(new Meeting(mtg.getStartTime(), mtg.getEndTime()));
//    }
//    List<Meeting> mergedList = new ArrayList<>();
//    mergedList.add(mtgList.get(0));
//    Meeting currentMergedMtg;
//    currentMergedMtg = mergedList.get(0);
//    if (mtgList != null) {
//      mtgList.remove(0);
//    }
//
//    while (mtgList.size() > 0) {
//      if (!(currentMergedMtg.getStartTime() <= mtgList.get(0).getStartTime())) {
//        mtgList.add(1, currentMergedMtg);
//        mergedList.remove(currentMergedMtg);
//        currentMergedMtg = mtgList.get(0);
//        mtgList.remove(0);
//      }
//      Meeting tempMergeMtg;
//      if (currentMergedMtg.getEndTime() >= mtgList.get(0).getStartTime()) {
//        if (currentMergedMtg.getEndTime() >= mtgList.get(0).getEndTime()) {
//          tempMergeMtg = new Meeting(currentMergedMtg.getStartTime(),
//              currentMergedMtg.getEndTime());
//          mergedList.remove(currentMergedMtg);
//          currentMergedMtg = tempMergeMtg;
//          tempMergeMtg = null;
//          mtgList.remove(0);
//          mergedList.add(currentMergedMtg);
//        } else {
//          tempMergeMtg = new Meeting(currentMergedMtg.getStartTime(), mtgList.get(0).getEndTime());
//          mergedList.remove(currentMergedMtg);
//          currentMergedMtg = tempMergeMtg;
//          tempMergeMtg = null;
//          mtgList.remove(0);
//          mergedList.add(currentMergedMtg);
//        }
//      } else {
//        currentMergedMtg = mtgList.get(0);
//        mtgList.remove(0);
//        mergedList.add(currentMergedMtg);
//      }
//    }
//    return mergedList;
//  }
//
//}
