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
		_room.EnterRoom(this); // �뿡 �����Ų ��
		this.room = _room; // ������ ���� ���� ������ �����Ѵ�.(�߿�)		
	}

	public void SetPlayerStatus(PlayerGameInfo.Status _status) { // ������ ���¸� ����
		this.playerStatus = _status;
	}

	public void SetPlayerLocation(PlayerGameInfo.Location _location) { // ������ ��ġ�� ����
		this.playerLocation = _location;
	}
	
	*/
}
