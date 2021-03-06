/* (c) 2015 Open Source Geospatial Foundation - all rights reserved
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */

package org.geoserver.geofence.services.dto;

import org.geoserver.geofence.core.model.AdminRule;
import org.geoserver.geofence.core.model.enums.AdminGrantType;

import java.io.Serializable;


/**
 *
 * @author ETj (etj at geo-solutions.it)
 */
public class ShortAdminRule implements Serializable
{
    private static final long serialVersionUID = -912718510863L;

    private Long id;
    private Long priority;

    private String userName;

    private String roleName;

    private Long instanceId;
    private String instanceName;

    private String workspace;

    private AdminGrantType access;

    public ShortAdminRule()
    {
    }

    public ShortAdminRule(AdminRule rule)
    {
        setId(rule.getId());
        setPriority(rule.getPriority());
        setUserName(rule.getUsername());
        setRoleName(rule.getRolename());

        if (rule.getInstance() != null)
        {
            setInstanceId(rule.getInstance().getId());
            setInstanceName(rule.getInstance().getName());
        }

        setWorkspace(rule.getWorkspace());

        setAccess(rule.getAccess());
    }

    public AdminGrantType getAccess()
    {
        return access;
    }

    public void setAccess(AdminGrantType access)
    {
        this.access = access;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getInstanceId()
    {
        return instanceId;
    }

    public void setInstanceId(Long instanceId)
    {
        this.instanceId = instanceId;
    }

    public String getInstanceName()
    {
        return instanceName;
    }

    public void setInstanceName(String instanceName)
    {
        this.instanceName = instanceName;
    }

    public long getPriority()
    {
        return priority;
    }

    public void setPriority(long priority)
    {
        this.priority = priority;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getWorkspace()
    {
        return workspace;
    }

    public void setWorkspace(String workspace)
    {
        this.workspace = workspace;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName())
                .append("[id:").append(id)
                .append(" pri:").append(priority);

        if (userName != null)
        {
            sb.append(" user:").append(userName);
        }

        if (roleName != null)
        {
            sb.append(" role:").append(roleName);
        }

        if (instanceId != null)
        {
            sb.append(" iId:").append(instanceId);
        }
        if (instanceName != null)
        {
            sb.append(" iName:").append(instanceName);
        }

        if (workspace != null)
        {
            sb.append(" ws:").append(workspace);
        }

        sb.append(" acc:").append(access);
        sb.append(']');

        return sb.toString();
    }
}
