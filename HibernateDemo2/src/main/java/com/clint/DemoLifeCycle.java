package com.clint;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.ReplicationMode;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.metamodel.relational.ForeignKey.ReferentialAction;

import com.entity.Student;

public class DemoLifeCycle {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory sf = configuration.buildSessionFactory();

		Session session = sf.openSession();

		// Student student = new Student(107, "llk", 8000);
//
//		Student s1 = (Student) session.get(Student.class, 107);
//

//		session.saveOrUpdate(student);
		// session.evict(student);

		// session.replicate(student, ReplicationMode.EXCEPTION);

		// session.get(Student.class, 103);

		// System.out.println(session.get(Student.class, 103));

		/*
		 * Student student = new Student();
		 * 
		 * student.setSname("vikram"); student.setSfee(75000);
		 * 
		 * session.save(student);
		 */
//----------------------------------------------------------------------------
//		Query query = session.createQuery("select max(sfee),min(sfee) From Student");
//
//		List<Object[]> list = query.list();
//
//		for (Object[] sfee : list) {
//
//			System.out.println(sfee[0] + " " + sfee[1]);
//		}

		// ---------------------------------------------------------
		/*
		 * Criteria criteria = session.createCriteria(Student.class); // Criterion
		 * criterion1 = Restrictions.eqOrIsNull("sname", "vikram"); Criterion criterion2
		 * = Restrictions.gt("sfee", 67349.00);
		 * 
		 * //criteria.add(criterion1); criteria.add(criterion2);
		 * 
		 * List<Student> students = criteria.list(); for (Student student : students) {
		 * System.out.println(student); }
		 */

		// ----------------------------------------------------------------------

		SQLQuery query = session.createSQLQuery("select * from student_hiber");
		query.addEntity(Student.class);

		// 1st Approch to get table data.

//		List<Object[]> list = query.list();
//
//		for (Object[] student : list) {
//			System.out.println(student[0] + " " + student[1] + " " + student[2]);
//		}

		// 2nd Approch to get table data........

//		List<Student> list = query.list();
//
//		for (Student student : list) {
//			System.out.println(student);
//		}

		// Projection..............

		ProjectionList list = Projections.projectionList();
		list.add(Projections.property("sid"));
		list.add(Projections.property("sname"));

		List<Object[]> students = session.createCriteria(Student.class).add(Restrictions.eq("sname", "kalyan"))
				.add(Restrictions.gt("sfee", 75000.00)).addOrder(Order.desc("sname")).setProjection(list).list();

		for (Object student[] : students) {
			System.out.println(student[0] + " " + student[1]);
		}

		session.beginTransaction().commit();

		session.close();

	}
}
