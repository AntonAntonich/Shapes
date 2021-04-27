package by.anton.shapes.repository.impl;

import by.anton.shapes.entity.CustomRectangle;
import by.anton.shapes.exception.CustomRectangleException;
import by.anton.shapes.factory.CustomRectangleFactory;
import by.anton.shapes.repository.CustomRepository;
import by.anton.shapes.repository.specicfication.impl.IdSpecification;
import by.anton.shapes.repository.specicfication.impl.PerimeterSpecification;
import by.anton.shapes.repository.specicfication.impl.PointXSpecification;
import by.anton.shapes.repository.specicfication.impl.SquareSpecification;
import by.anton.shapes.repository.specicfication.Specification;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustomRectangleRepository implements CustomRepository {
    private List<CustomRectangle> customRectangleList = new ArrayList<>();

    @Override
    public void addAll(List<Double []> rectanglesPoints) throws CustomRectangleException {
        if(rectanglesPoints == null) {
            throw  new CustomRectangleException();
        }
        CustomRectangleFactory customRectangleFactory = new CustomRectangleFactory();
        for (Double [] elements : rectanglesPoints) {
            CustomRectangle customRectangle =  customRectangleFactory.createCustomRectangle(elements);
            customRectangleList.add(customRectangle);
        }
    }

    @Override
    public boolean removeAll(List<CustomRectangle> customRectanglesList) throws CustomRectangleException {
        if(customRectanglesList == null) {
            throw  new CustomRectangleException();
        }
        return customRectangleList.removeAll(customRectanglesList);
    }

    @Override
    public boolean addByValue(CustomRectangle customRectangle) {
        return customRectangleList.add(customRectangle);
    }

    @Override
    public boolean removeByValue(CustomRectangle customRectangle) {
        return customRectangleList.remove(customRectangle);
    }

    public CustomRectangle getByIndex(int i) throws CustomRectangleException{
        if(i < 0) {
            throw  new CustomRectangleException();
        }
        return customRectangleList.get(i);
    }

    @Override
    public CustomRectangle setByIndex(int i, CustomRectangle customRectangle) throws CustomRectangleException{
        if((customRectangle == null) || (i < 0)) {
            throw  new CustomRectangleException();
        }
        return customRectangleList.set(i, customRectangle);
    }

    @Override
    public int indexOf(CustomRectangle customRectangle) {
        return customRectangleList.indexOf(customRectangle);
    }

    @Override
    public List<CustomRectangle> queryUsingStreams(Specification specification) {
        List<CustomRectangle> newCustomRectangleList =
                customRectangleList.stream().filter(specification::specify).collect(Collectors.toList());
        return newCustomRectangleList;
    }

    @Override
    public List<CustomRectangle> query(Specification specification) {
        List<CustomRectangle> newCustomRectangleList = new ArrayList<>();
        for (CustomRectangle c : customRectangleList) {
            if(specification.specify(c)) {
                newCustomRectangleList.add(c);
            }
        }
        return newCustomRectangleList;
    }


}
