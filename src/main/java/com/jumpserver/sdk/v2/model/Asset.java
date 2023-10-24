package com.jumpserver.sdk.v2.model;

import java.util.List;

public class Asset {
    private String id;

    private String name;

    private String address;

    private String comment;

    private String domain;

    private String platform;

    private List<Protocol> protocols;

    private String[] nodes;

    private String nodes_display;

    private List<Label> label;

    private List<Account> accounts;

    private String category;

    private String type;

    private String connectivity;

    private String auto_info;

    private String org_id;

    private String org_name;

    private String spec_info;

    private Boolean is_active;

    private String date_verified;

    private String date_created;

    private Info info;

    private static class Info {
        private String vendor;
        private String model;
        private String sn;
        private String[] cpu_model;
        private Integer cpu_count;
        private Integer cpu_cores;
        private Integer cpu_vcpus;
        private String memory;
        private String disk_total;
        private String distribution;
        private String distribution_version;
        private String arch;

        public String getVendor() {
            return vendor;
        }

        public void setVendor(String vendor) {
            this.vendor = vendor;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getSn() {
            return sn;
        }

        public void setSn(String sn) {
            this.sn = sn;
        }

        public String[] getCpu_model() {
            return cpu_model;
        }

        public void setCpu_model(String[] cpu_model) {
            this.cpu_model = cpu_model;
        }

        public Integer getCpu_count() {
            return cpu_count;
        }

        public void setCpu_count(Integer cpu_count) {
            this.cpu_count = cpu_count;
        }

        public Integer getCpu_cores() {
            return cpu_cores;
        }

        public void setCpu_cores(Integer cpu_cores) {
            this.cpu_cores = cpu_cores;
        }

        public Integer getCpu_vcpus() {
            return cpu_vcpus;
        }

        public void setCpu_vcpus(Integer cpu_vcpus) {
            this.cpu_vcpus = cpu_vcpus;
        }

        public String getMemory() {
            return memory;
        }

        public void setMemory(String memory) {
            this.memory = memory;
        }

        public String getDisk_total() {
            return disk_total;
        }

        public void setDisk_total(String disk_total) {
            this.disk_total = disk_total;
        }

        public String getDistribution() {
            return distribution;
        }

        public void setDistribution(String distribution) {
            this.distribution = distribution;
        }

        public String getDistribution_version() {
            return distribution_version;
        }

        public void setDistribution_version(String distribution_version) {
            this.distribution_version = distribution_version;
        }

        public String getArch() {
            return arch;
        }

        public void setArch(String arch) {
            this.arch = arch;
        }
    }

    public static class Label {
        private String id;
        private String name;
        private String value;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public List<Protocol> getProtocols() {
        return protocols;
    }

    public void setProtocols(List<Protocol> protocols) {
        this.protocols = protocols;
    }

    public String getNodes_display() {
        return nodes_display;
    }

    public void setNodes_display(String nodes_display) {
        this.nodes_display = nodes_display;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getConnectivity() {
        return connectivity;
    }

    public void setConnectivity(String connectivity) {
        this.connectivity = connectivity;
    }

    public String getAuto_info() {
        return auto_info;
    }

    public void setAuto_info(String auto_info) {
        this.auto_info = auto_info;
    }

    public String getOrg_id() {
        return org_id;
    }

    public void setOrg_id(String org_id) {
        this.org_id = org_id;
    }

    public String getOrg_name() {
        return org_name;
    }

    public void setOrg_name(String org_name) {
        this.org_name = org_name;
    }

    public String getSpec_info() {
        return spec_info;
    }

    public void setSpec_info(String spec_info) {
        this.spec_info = spec_info;
    }

    public Boolean getIs_active() {
        return is_active;
    }

    public void setIs_active(Boolean is_active) {
        this.is_active = is_active;
    }

    public String getDate_verified() {
        return date_verified;
    }

    public void setDate_verified(String date_verified) {
        this.date_verified = date_verified;
    }

    public String getDate_created() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public String[] getNodes() {
        return nodes;
    }

    public void setNodes(String[] nodes) {
        this.nodes = nodes;
    }

    public List<Label> getLabel() {
        return label;
    }

    public void setLabel(List<Label> label) {
        this.label = label;
    }
}
