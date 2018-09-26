public class Job
{
    private String owner;
    private int jobId;
    Job(String o, int j)
    {
        owner = o;
        jobId = j;
    }
    public String getOwner()
    {
        return owner;
    }
    public int getJobId()
    {
        return jobId;
    }

    @Override
    public String toString() {
        return owner+"   "+jobId;
    }
}