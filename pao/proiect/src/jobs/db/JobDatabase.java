package jobs.db;

import jobs.model.Company;
import jobs.model.Job;

import java.util.List;

public interface JobDatabase {
    void addCompany(Company company);
    List<Company> getCompanies();

    Company findCompanyByName(String name);

    void addJob(Job job);

    List<Job> getJobPostings();
}