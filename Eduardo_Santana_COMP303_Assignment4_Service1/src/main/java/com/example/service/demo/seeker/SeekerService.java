/**
 * 
 */
package com.example.service.demo.seeker;

import org.springframework.stereotype.Service;

import com.example.service.demo.generic.ServiceBaseAbstract;

/**
 * Student Name: Eduardo Santana
 * Student Number: 301048660
 * Submission Date: 2019-11-15 (Estimated)
 * File Created: Nov. 6, 2019
 */

/**
 * SeekerService we are re-using the ServiceBase almost 100 percent or de code.
 */
@Service
public class SeekerService extends ServiceBaseAbstract<Seeker> 
{
	public SeekerService()
	{
		super();
	}

	public void SeedDatabase()
	{
		this.createItem(new Seeker("Eduardo", "Santana", "25", "Male", "A+", "Santo Domingo", "+1809-315-8965"));
		this.createItem(new Seeker("Martin", "Emilio", "15", "Male", "B+", "Santo Domingo", "+1809-315-9999"));
		this.createItem(new Seeker("Ricky", "Marting", "35", "Male", "C+", "Santo Domingo", "+1809-315-8888"));
	}
}
