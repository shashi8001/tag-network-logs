package org.shashidharkumar.src;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        String flowLogFile = "C:\\Users\\shash\\Documents\\Learning\\Spring\\illumio-tag-network-logs-assmt\\src\\main\\java\\org\\shashidharkumar\\src\\input\\flow-logs";
        String lookUpFile = "C:\\Users\\shash\\Documents\\Learning\\Spring\\illumio-tag-network-logs-assmt\\src\\main\\java\\org\\shashidharkumar\\src\\input\\look-up-table";
        String protocolFile = "C:\\Users\\shash\\Documents\\Learning\\Spring\\illumio-tag-network-logs-assmt\\src\\main\\java\\org\\shashidharkumar\\src\\input\\protocol-numbers-1.csv";
        String tagCountOutputFile = "C:\\Users\\shash\\Documents\\Learning\\Spring\\illumio-tag-network-logs-assmt\\src\\main\\java\\org\\shashidharkumar\\src\\output\\tagCount";
        String portProtocolTagCountOutputFile = "C:\\Users\\shash\\Documents\\Learning\\Spring\\illumio-tag-network-logs-assmt\\src\\main\\java\\org\\shashidharkumar\\src\\output\\portProtocolTagCount";

        ProtocolMapper protocolMapper = new ProtocolMapper(protocolFile);

        FlowLogProcessor flowLogProcessor = new FlowLogProcessor(new DefaultTaggingStrategy(lookUpFile,protocolMapper));

        flowLogProcessor.processFlowLogs(flowLogFile);

        flowLogProcessor.writeTagCountsToFile(tagCountOutputFile);

        flowLogProcessor.writePortProtocolCountsToFile(portProtocolTagCountOutputFile);




    }
}