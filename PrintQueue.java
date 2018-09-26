import java.util.ArrayList;

public class PrintQueue extends GenericQueue {

    public GenericQueue<Job> pq;

    PrintQueue() {
        pq = new GenericQueue<Job>();
    }

    //void lpr (String owner, int jobId)
    //Enqueues a job with the specified owner name and job id
    public void lpr(String owner, int jobId) {
        Job item = new Job(owner, jobId);
        pq.enqueue(item);
    }

    //void lpq()
    //Prints all the entries in this queue
    public void lpq() {
       for(int i=0;i<pq.size();i++){
           System.out.println(pq.getItem(i));
       }
    }

    //void lprm(int jobId)
    //Removes the active job at the front of the queue if jobId matches, error message otherwise
    public void lprm(int jobId) {
        boolean flag = false;
        for (int i = 0; i < pq.size(); i++) {
            if (jobId == pq.getItem(i).getJobId()) {
                pq.remove(i);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("NO such item!");
        }
    }
    //void lprmAll(String owner)
    //Removes all jobs from the queue that have been submitted by the owner

    public void lprmAll(String owner) {
        boolean flag = false;
        for (int i = 0; i < pq.size(); i++) {
            if (owner.equals(pq.getItem(i).getOwner())) {
                pq.remove(i);
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("NO such item!");
        }
    }
}

