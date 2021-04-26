package by.anton.shapes.warehouse;

import by.anton.shapes.entity.CustomRectangleParameter;

import java.util.HashMap;
import java.util.Map;

public class CustomRectangleWarehouse {
    private static final CustomRectangleWarehouse INSTANCE = new CustomRectangleWarehouse();
    private Map<Long, CustomRectangleParameter> parameterMap = new HashMap<>();

    private CustomRectangleWarehouse() {}

    public  static CustomRectangleWarehouse getInstance() {
        return INSTANCE;
    }

    public CustomRectangleParameter putCustomRectangleParameter(long id, CustomRectangleParameter customRectangleParameter) {
        CustomRectangleParameter current = parameterMap.get(id);
        parameterMap.put(id, customRectangleParameter);
        //log id of previous
        return current;
    }

    public CustomRectangleParameter getRectangleParameterById(long id) {
        return parameterMap.get(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Container{");
        sb.append("parameterMap=").append(parameterMap);
        sb.append('}');
        return sb.toString();
    }
}
