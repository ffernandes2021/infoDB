package controller;

import model.entity.FunctionMetadata;
import model.service.FunctionMetadataService;
import model.service.error.ErrorMessage;
import java.util.List;

/**
 *
 * @author Fábio Fernandes
 * @version 1.0
 */
public class GenerateFunctionMetadataController {

    /**
     * Recupera uma lista de FunctionMetadata.
     *
     * @return fmList
     */
    public List<FunctionMetadata> generate() {
        try {
            FunctionMetadataService fmService = new FunctionMetadataService();
            List<FunctionMetadata> fmList = fmService.getFunctionMetadata();
            return fmList;
        } catch (RuntimeException e) {
            throw new RuntimeException(ErrorMessage.ERROR_FUNCTION_METADATA.concat(ErrorMessage.ERROR_EXCEPTION).concat(e.getMessage()));
        }
    }

}