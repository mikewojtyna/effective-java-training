package pro.buildmysoftware.repository;

import org.h2.result.Row;

public interface Mapper<T> {

	T mapRow(Row row);
}
