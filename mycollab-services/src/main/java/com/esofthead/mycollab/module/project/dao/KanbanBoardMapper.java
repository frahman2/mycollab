/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.esofthead.mycollab.module.project.dao;

import com.esofthead.mycollab.core.persistence.ICrudGenericDAO;
import com.esofthead.mycollab.module.project.domain.KanbanBoard;
import com.esofthead.mycollab.module.project.domain.KanbanBoardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface KanbanBoardMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_kanban_board
     *
     * @mbggenerated Tue Mar 22 23:27:23 ICT 2016
     */
    int countByExample(KanbanBoardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_kanban_board
     *
     * @mbggenerated Tue Mar 22 23:27:23 ICT 2016
     */
    int deleteByExample(KanbanBoardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_kanban_board
     *
     * @mbggenerated Tue Mar 22 23:27:23 ICT 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_kanban_board
     *
     * @mbggenerated Tue Mar 22 23:27:23 ICT 2016
     */
    int insert(KanbanBoard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_kanban_board
     *
     * @mbggenerated Tue Mar 22 23:27:23 ICT 2016
     */
    int insertSelective(KanbanBoard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_kanban_board
     *
     * @mbggenerated Tue Mar 22 23:27:23 ICT 2016
     */
    List<KanbanBoard> selectByExample(KanbanBoardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_kanban_board
     *
     * @mbggenerated Tue Mar 22 23:27:23 ICT 2016
     */
    KanbanBoard selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_kanban_board
     *
     * @mbggenerated Tue Mar 22 23:27:23 ICT 2016
     */
    int updateByExampleSelective(@Param("record") KanbanBoard record, @Param("example") KanbanBoardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_kanban_board
     *
     * @mbggenerated Tue Mar 22 23:27:23 ICT 2016
     */
    int updateByExample(@Param("record") KanbanBoard record, @Param("example") KanbanBoardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_kanban_board
     *
     * @mbggenerated Tue Mar 22 23:27:23 ICT 2016
     */
    int updateByPrimaryKeySelective(KanbanBoard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_kanban_board
     *
     * @mbggenerated Tue Mar 22 23:27:23 ICT 2016
     */
    int updateByPrimaryKey(KanbanBoard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_kanban_board
     *
     * @mbggenerated Tue Mar 22 23:27:23 ICT 2016
     */
    Integer insertAndReturnKey(KanbanBoard value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_kanban_board
     *
     * @mbggenerated Tue Mar 22 23:27:23 ICT 2016
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_kanban_board
     *
     * @mbggenerated Tue Mar 22 23:27:23 ICT 2016
     */
    void massUpdateWithSession(@Param("record") KanbanBoard record, @Param("primaryKeys") List primaryKeys);
}