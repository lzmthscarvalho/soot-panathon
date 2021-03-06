package soot.jimple;

/*-
 * #%L
 * Soot - a J*va Optimization Framework
 * %%
 * Copyright (C) 1997 - 1999 Raja Vallee-Rai
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 2.1 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-2.1.html>.
 * #L%
 */

import soot.util.Switch;

public interface StmtSwitch extends Switch {
  void caseBreakpointStmt(BreakpointStmt stmt);

  void caseInvokeStmt(InvokeStmt stmt);

  void caseAssignStmt(AssignStmt stmt);

  void caseIdentityStmt(IdentityStmt stmt);

  void caseEnterMonitorStmt(EnterMonitorStmt stmt);

  void caseExitMonitorStmt(ExitMonitorStmt stmt);

  void caseGotoStmt(GotoStmt stmt);

  void caseIfStmt(IfStmt stmt);

  void caseLookupSwitchStmt(LookupSwitchStmt stmt);

  void caseNopStmt(NopStmt stmt);

  void caseRetStmt(RetStmt stmt);

  void caseReturnStmt(ReturnStmt stmt);

  void caseReturnVoidStmt(ReturnVoidStmt stmt);

  void caseTableSwitchStmt(TableSwitchStmt stmt);

  void caseThrowStmt(ThrowStmt stmt);

  void defaultCase(Object stmt);
}
