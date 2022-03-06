<%--
  Created by IntelliJ IDEA.
  User: dinhaoyuan
  Date: 2022/3/6
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="register.jsp" method="post">
    <table align="center">
        <tr>
            <td>UserName:</td>
            <td><input type="text" name=name autofocus="autofocus" value="Username"></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type="text" name=password value="password"></td>
        </tr>
        <tr>
            <td>confirm your password:</td>
            <td><input type="text" name=refill></td>
        </tr>
        <tr>
            <td>Birthday:</td>
            <td>
                <select>
                    <option>--please choose the year--</option>
                    <option>2000</option>
                    <option>2001</option>
                    <option>2002</option>
                    <option>2003</option>
                    <option>2004</option>
                    <option>2005</option>
                    <option>2006</option>
                    <option>2007</option>
                    <option>2008</option>
                    <option>2009</option>
                    <option>2010</option>
                </select>
                <select>
                    <option>--please choose the month</option>
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                    <option>5</option>
                    <option>6</option>
                    <option>7</option>
                    <option>8</option>
                    <option>9</option>
                    <option>10</option>
                    <option>11</option>
                    <option>12</option>
                </select>
                <select>
                    <option>--please choose the day</option>
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                    <option>5</option>
                    <option>6</option>
                    <option>7</option>
                    <option>8</option>
                    <option>9</option>
                    <option>10</option>
                    <option>11</option>
                    <option>12</option>
                    <option>13</option>
                    <option>14</option>
                    <option>15</option>
                    <option>16</option>
                    <option>17</option>
                    <option>18</option>
                    <option>19</option>
                    <option>20</option>
                    <option>21</option>
                    <option>22</option>
                    <option>23</option>
                    <option>24</option>
                    <option>25</option>
                    <option>26</option>
                    <option>27</option>
                    <option>28</option>
                    <option>29</option>
                    <option>30</option>
                    <option>31</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>area</td>
            <td><input type="text" value="East China Jiaotong University"></td>
        </tr>
        <tr>
            <td>education:</td>
            <td>
                <input type="radio" name="bachelor">bachelor <input type="radio" name="master">master <input type="radio" name="doctor">doctor
            </td>
        </tr>
        <tr>
            <td>E-mail</td>
            <td><input type="text" value="please write your email here"></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" value="submit">
                <input type="reset" value="reset">
            </td>
        </tr>
    </table>

</form>
</body>
</html>
