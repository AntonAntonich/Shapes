package by.anton.shapes.repository;

import by.anton.shapes.entity.CustomRectangle;
import by.anton.shapes.exception.CustomRectangleException;
import by.anton.shapes.repository.specicfication.Specification;

import java.util.List;

public interface CustomRepository {
    public void addAll(List<Double []> rectanglesPoints) throws CustomRectangleException;
    public boolean removeAll(List<CustomRectangle> customRectanglesList) throws CustomRectangleException;
    public boolean addByValue(CustomRectangle customRectangle) throws CustomRectangleException;
    public boolean removeByValue(CustomRectangle customRectangle) throws CustomRectangleException;
    public CustomRectangle getByIndex(int i) throws CustomRectangleException;
    public CustomRectangle setByIndex(int i, CustomRectangle customRectangle) throws CustomRectangleException;
    public int indexOf(CustomRectangle customRectangle) throws CustomRectangleException;

    public List<CustomRectangle> queryUsingStreams(Specification specification) throws CustomRectangleException;
    public List<CustomRectangle> query(Specification specification) throws CustomRectangleException;



}
