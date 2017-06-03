import java.net.Socket;


public class GameUser {
	
	//GameRoom room;
	Socket m_sok;
	String m_nickName;
	int m_uid;
	
	public GameUser(){
		
	}
	
	public GameUser(String nickName){
		this.m_nickName = nickName;
		
	}
	
	public GameUser(int uid, String nickName){
		m_uid = uid;
		m_nickName = nickName;
		
	}
	
	
	/*
	public void EnterRoom(GameRoom _room) {
		_room.EnterRoom(this); // 룸에 입장시킨 후
		this.room = _room; // 유저가 속한 방을 룸으로 변경한다.(중요)		
	}

	public void SetPlayerStatus(PlayerGameInfo.Status _status) { // 유저의 상태를 설정
		this.playerStatus = _status;
	}

	public void SetPlayerLocation(PlayerGameInfo.Location _location) { // 유저의 위치를 설정
		this.playerLocation = _location;
	}
	
	*/
}
