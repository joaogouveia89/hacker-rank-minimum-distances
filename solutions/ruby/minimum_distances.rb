def minimum_distances a
	values_checked = {}
	min_dist = -1
	dist = min_dist
	a.each.with_index do |el, idx|
		if values_checked.include? el
			dist = idx - values_checked[el]
			if min_dist == -1 || min_dist > dist
				min_dist = dist
			end
		end
		values_checked[el] = idx
	end
	return min_dist
end